package test.mighty;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import test.mighty.dao.BlogsDAOInterface;
import test.mighty.dao.ContactDAOInterface;
import test.mighty.dao.NewsletterDAOInterface;
import test.mighty.dao.ProjectsDAOInterface;
import test.mighty.dao.WorkersDAOInterface;
import test.mighty.entity.Blogs;
import test.mighty.entity.Contact;
import test.mighty.entity.Newsletter;

@Controller
@RequestMapping("/")
public class FrontController {

	@Autowired
	private BlogsDAOInterface blogsDAO; 
	@Autowired
	private ContactDAOInterface contactDAO;
	@Autowired
	private ProjectsDAOInterface projectsDAO;
	@Autowired
	private WorkersDAOInterface workersDAO;
	@Autowired
	private NewsletterDAOInterface newsletterDAO;
	
	@RequestMapping({"/", "/main-page"})
	public String getMainPage(Model model) {
		
		model.addAttribute("workers", workersDAO.getWorkersOnPage());
		model.addAttribute("projects", projectsDAO.getProjectsOnPage());
		model.addAttribute("blogs", blogsDAO.getBlogsOnPage());
		model.addAttribute("newsletter", new Newsletter());
		
		return "front/main-page";
	}
	
	@RequestMapping("/newsletter-save")
	public String saveNewsletter(@Valid @ModelAttribute Newsletter newsletter, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			
			return "front/main-page";
		}
		
		newsletterDAO.saveNewsletter(newsletter);
		
		return "redirect: main-page";
		
		
	}
	
	@RequestMapping("/about-page")
		public String getAboutPage(Model model) {
		
		model.addAttribute("workers", workersDAO.getWorkersOnPage());
		model.addAttribute("projects", projectsDAO.getProjectsOnPage());
		model.addAttribute("newsletter", new Newsletter());
		
		return "front/about-page";
	}
	
	@RequestMapping("/work-page")
	public String getWorkPage(Model model) {
	
	model.addAttribute("workers", workersDAO.getWorkersOnPage());
	model.addAttribute("projects", projectsDAO.getProjectsOnPage());
	model.addAttribute("newsletter", new Newsletter());
	
	return "front/work-page";
}
	
	@RequestMapping("/contact-page")
	public String getContactPage(Model model) {
	
	model.addAttribute("contact", new Contact());
	model.addAttribute("newsletter", new Newsletter());
	
	return "front/contact-page";
}
	
	@RequestMapping("/contact-save")
	public String saveWorker(@ModelAttribute Contact contact, BindingResult result) {
		
		if (result.hasErrors()) {
			
			return "main-page";
		}
		
		contactDAO.saveContact(contact);
		
		return "redirect:/contact-page";
		
	}
	
	@RequestMapping("/blog-page")
	public String getBlogsPage(Model model) {
	
		List<Blogs> blogList = blogsDAO.getBlogsList();
		model.addAttribute("blogList", blogList);
		
		model.addAttribute("newsletter", new Newsletter());
		
		return "front/blog-page";
}
	
	@RequestMapping("/single-page")
	public String getSinglePage(@RequestParam int id, Model model) {
		
		Blogs blog = blogsDAO.getBlog(id);
		model.addAttribute("blog", blog);
		
		model.addAttribute("newsletter", new Newsletter());
		
		return "front/blog-page";
}
	
}
