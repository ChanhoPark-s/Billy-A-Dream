package reservation.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import product.model.ProductBean;
import util.DateParse;

@Component("ReservationDao")
public class ReservationDao {
		
		@Autowired
		SqlSessionTemplate sqlSessionTemplate;
		
		private String namespace="reservation.model.ReservationBean";

		public void InsertReservation(ReservationBean rb) {
			int result = sqlSessionTemplate.insert(namespace+".InsertReservation",rb);
			System.out.println(result);
		}
		
		public List<ReservationBean> getAllReservationOnlyDates(String pno) {
			List<ReservationBean> result = sqlSessionTemplate.selectList(namespace+".GetAllReservationOnlyDates", pno);
			System.out.println("size:" + result.size());
			return result;
		}

		public List<ReservationBean> getAllByBuyer_no(String Buyer_no) {
			List<ReservationBean>lists =  sqlSessionTemplate.selectList(namespace+".getAllByBuyer_no",Buyer_no);
			return lists; 
		}

		public List<ReservationBean> getAllByMno(int mno) {
			List<ReservationBean> lists = sqlSessionTemplate.selectList(namespace+".getAllByMno",mno);
			return lists;
		}
		public List<ReservationDetailBean> getAllResrvation(Map<String, String> map) {
			List<ReservationDetailBean> list = sqlSessionTemplate.selectList(namespace+".getAllResrvation",map);
			List<ReservationDetailBean> lists = new ArrayList<ReservationDetailBean>();
			String now=DateParse.getTodayPlus(0);
			for(ReservationDetailBean rdBean : list) {
				System.out.println(rdBean.getStart_date());
				String strtdate =rdBean.getStart_date();
				String[] startdate=strtdate.split(" ");
				String endate=rdBean.getEnd_date();
				String[] enddate=endate.split(" ");
				
				rdBean.setStart_date(startdate[0]);
				rdBean.setEnd_date(enddate[0]);
				if(Integer.parseInt(now)<Integer.parseInt(DateParse.dateToStr(rdBean.getStart_date()))) {
					rdBean.setUse(3);
				} else if(Integer.parseInt(now)>=Integer.parseInt(DateParse.dateToStr(rdBean.getStart_date()))
						||Integer.parseInt(now)<Integer.parseInt(DateParse.dateToStr(rdBean.getEnd_date()))) {
					rdBean.setUse(2);
				} else if(Integer.parseInt(now)==Integer.parseInt(DateParse.dateToStr(rdBean.getEnd_date()))){
					rdBean.setUse(1);
				} else {
					rdBean.setUse(0);					
				}
				if(rdBean.getIs_accepted().equals("2")){
					rdBean.setUse(4);					
				} 
				lists.add(rdBean);
			}
			return lists;
		}

		public void updateAccept(String rno) {
			int result = sqlSessionTemplate.update(namespace+".updateAccept",rno);
			System.out.println("승인한 결과 :"+result);
		}
		public void withdrawReservation(ReservationBean rs) {
			sqlSessionTemplate.update(namespace+".WithdrawReservation", rs);
		}
		public void rollbackWithdrawReservation(int no) {
			sqlSessionTemplate.update(namespace+".RollbackWithdrawReservation", no);
		}

		public void changeStatus2() {
			sqlSessionTemplate.update(namespace+".changeStatus2");
			
		}
		public void changeStatusfor3() {
			sqlSessionTemplate.update(namespace+".changeStatusfor3");
			
		}

		public int CheckReviewAuth(Map<String, String> map) {
			int count = sqlSessionTemplate.selectOne(namespace+".CheckReviewAuth",map);
			return count;
		}


}
