package product.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lcategory.model.LcategoryBean;
import lcategory.model.LcategoryDao;
import member.model.MemberBean;
import member.model.MemberDao;
import product.model.ProductBean;
import product.model.ProductDao;
import scategory.model.ScategoryBean;
import scategory.model.ScategoryDao;
import util.PagingProduct;

@Controller
public class ProductSearchTextController {

	
	private final String command = "search.prd";
	private String getPage = "productSearchResult";
	
	@Autowired
	private ProductDao pdao;
	
//	@Autowired
//	private MemberDao mdao; // org.springframework.beans.factory.NoSuchBeanDefinitionException: No matching bean of type [member.model.MemberDao] found for dependency
//	
	@Autowired
	private LcategoryDao lcategoryDao;
	
	@Autowired
	private ScategoryDao scategoryDao;
	
	@RequestMapping(command)
	public String detailForm(@RequestParam("whatColumn") String whatColumn, 
								@RequestParam("keyword") String keyword,
								@RequestParam(value = "pageNumber", required = false) String pageNumber,
								HttpServletRequest request,
								Model model){
		
		System.out.println("ProductSearchController ���� �Ѱܹ��� 2���� ��");
		System.out.println("whatColumn:" + whatColumn);
		System.out.println("keyword: " + keyword);
		keyword = keyword.toUpperCase();
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("whatColumn", whatColumn); // genre or grade or actor
		
		if(whatColumn.equals("name") || whatColumn.equals("address")) { // product name search
			map.put("keyword", "%"+ keyword + "%"); // �̸� %�� �ٿ��� �Ѱ���� ��.
		}else {
			map.put("keyword", keyword); // �̸� %�� �ٿ��� �Ѱ���� ��.
		}
		
		// �˻� ���ǿ� �´� ���ڵ��� ������ ����� ������
		int totalCount = pdao.getTotalSearchCount(map);
		System.out.println("totalCount of the result list by search: " + totalCount);
		
		String url = request.getContextPath() + "/" + command; // url = "/ex/list.tv" ������ ��ȣ�� �̷��� �־���� �ؼ�.
		PagingProduct pageInfo = new PagingProduct(pageNumber, null, totalCount, url, whatColumn, keyword); // null ��ſ� 3�� �ѱ�� �� �������� 3���� ������
		
		List<ProductBean> resultProductList = pdao.getProductListBySearch(map, pageInfo);
		System.out.println("size of the list will be shown in this page: " + resultProductList.size());		
		
		model.addAttribute("resultProductList", resultProductList);
		model.addAttribute("pageInfo", pageInfo);
		
		return getPage;
	}
}
