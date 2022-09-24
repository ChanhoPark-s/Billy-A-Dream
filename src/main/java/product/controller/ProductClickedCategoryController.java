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
public class ProductClickedCategoryController {

	private final String command = "clickedCateName.prd";
	private String getPage = "productLCategoryClicked";
	
	@Autowired
	private ProductDao pdao;
	
	@RequestMapping(command)
	public String detailForm(@RequestParam("whatColumn") String whatColumn,
								@RequestParam("keyword") String keyword, 
								@RequestParam(value = "pageNumber", required = false) String pageNumber,
								HttpServletRequest request,
								Model model){
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("whatColumn", whatColumn); // genre or grade or actor
		map.put("keyword", keyword); // �̸� %�� �ٿ��� �Ѱ���� ��.
		
		// �˻� ���ǿ� �´� ���ڵ��� ������ ����� ������
		int totalCount = pdao.getTotalSearchCount(map);
		String url = request.getContextPath() + "/" + command; // url = "/ex/list.tv" ������ ��ȣ�� �̷��� �־���� �ؼ�.
		PagingProduct pageInfo = new PagingProduct(pageNumber, null, totalCount, url, whatColumn, keyword); // null ��ſ� 3�� �ѱ�� �� �������� 3���� ������
		
		List<ProductBean> resultProductList = pdao.getProductListBySearch(map, pageInfo);
		
		model.addAttribute("resultProductList", resultProductList);
		model.addAttribute("pageInfo", pageInfo);
		
		return getPage;
	}
}
