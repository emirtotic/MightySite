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
import test.mighty.entity.Projects;
import test.mighty.entity.Workers;

@Controller
@RequestMapping("/administration")
public class BackController {
	
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
	
	@RequestMapping({"/","/main-page"})
	public String getMainPage() {
		
		
		return "main-page";
	}
	
	
	// WORKERS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	@RequestMapping("/workers-list")
	public String getWorkersPage(Model model) {
		
		List<Workers> workersList = workersDAO.getWorkersList();
		model.addAttribute("workersList", workersList);
		
		return "workers-page";
	}
	
	@RequestMapping("/workers-delete")
	public String deleteWorker(int id) {
		
		workersDAO.deleteWorkers(id);
		
		return "redirect:/administration/workers-list";
		
	}
	
	@RequestMapping("/workers-save")
	public String saveWorker(@ModelAttribute Workers workers, BindingResult result) {
		
		if (result.hasErrors()) {
			
			return "workers-form";
		}
		
		workersDAO.saveWorkers(workers);
		
		return "redirect:/administration/workers-list";
		
	}
	
	@RequestMapping("/workers-form")
	public String getWorkersForm(Model model) {
		
		Workers workers = new Workers();
		model.addAttribute("workers", workers);
		
		return "workers-form";
	}
	
	
	@RequestMapping("/workers-form-update")
	public String getWorkersUpdateForm(@RequestParam int id, Model model) {

		Workers workers = workersDAO.getWorkers(id);
		
		model.addAttribute("workers", workers);
		
		return "workers-form";
	}
	
	
	// CONTACT !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	@RequestMapping("/contact-list")
	public String getContactsPage(Model model) {
		
		List<Contact> contactsList = contactDAO.getContactList();
		model.addAttribute("contactsList", contactsList);
		
		return "contacts-page";
	}
	
	@RequestMapping("/contact-delete")
	public String deleteContact(int id) {
		
		contactDAO.deleteContact(id);
		
		return "redirect:/administration/contact-list";
		
	}
	
	@RequestMapping("/contact-save")
	public String saveWorker(@ModelAttribute Contact contact, BindingResult result) {
		
		if (result.hasErrors()) {
			
			return "contact-form";
		}
		
		contactDAO.saveContact(contact);
		
		return "redirect:/administration/contact-list";
		
	}
	
	@RequestMapping("/contact-form-update")
	public String getContactUpdateForm(@RequestParam int id, Model model) {

		Contact contact = contactDAO.getContact(id);
		
		model.addAttribute("contact", contact);
		
		return "contacts-form";
	}
	
	@RequestMapping("/contact-form")
	public String getContactForm(Model model) {
		
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		
		return "contacts-form";
	}
	
	// PROJECTS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	@RequestMapping("/projects-list")
	public String getProjectsPage(Model model) {
		
		List<Projects> projectsList = projectsDAO.getProjectList();
		model.addAttribute("projectsList", projectsList);
		
		return "projects-page";
	}
	
	@RequestMapping("/project-delete")
	public String deleteProject(int id) {
		
		projectsDAO.deleteProject(id);
		
		return "redirect:/administration/projects-list";
		
	}
	
	@RequestMapping("/projects-form")
	public String getProjectForm(Model model) {
		
		Projects projects = new Projects();
		model.addAttribute("projects", projects);
		
		return "projects-form";
	}
	
	@RequestMapping("/projects-form-update")
	public String getProjectUpdateForm(@RequestParam int id, Model model) {

		Projects projects = projectsDAO.getProject(id);
		model.addAttribute("projects", projects);
		
		return "projects-form";
	}
	
	@RequestMapping("/project-save")
	public String saveWorker(@ModelAttribute Projects project, BindingResult result) {
		
		if (result.hasErrors()) {
			
			return "projects-form";
		}
		
		projectsDAO.saveProject(project);
		
		return "redirect:/administration/projects-list";
		
	}
	
	// BLOGS !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
		@RequestMapping("/blogs-list")
		public String getBlogsPage(Model model) {
			
			List<Blogs> blogsList = blogsDAO.getBlogsList();
			model.addAttribute("blogsList", blogsList);
			
			return "blogs-page";
		}
		
		@RequestMapping("/blog-delete")
		public String deleteBlog(int id) {
			
			blogsDAO.deleteBlog(id);
			
			return "redirect:/administration/blogs-list";
			
		}
		
		@RequestMapping("/blogs-form")
		public String getBlogForm(Model model) {
			
			Blogs blog = new Blogs();
			model.addAttribute("blog", blog);
			
			return "blogs-form";
		}
		
		@RequestMapping("/blogs-form-update")
		public String getBlogUpdateForm(@RequestParam int id, Model model) {
			
			Blogs blog = blogsDAO.getBlog(id);
			model.addAttribute("blog", blog);
			
			return "blogs-form";
		}
		
		@RequestMapping("/blogs-save")
		public String saveBlog(@ModelAttribute Blogs blog, BindingResult result) {
			
			if (result.hasErrors()) {
				
				return "blogs-form";
			}
			
			blogsDAO.saveBlog(blog);
			
			return "redirect:/administration/blogs-list";
			
		}
		
		
		// NEWSLETTER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		@RequestMapping("/newsletter-list")
		public String getNewsletterList(Model model) {
			
			List<Newsletter> newsletterList = newsletterDAO.getNewsletterList();
			model.addAttribute("newsletterList", newsletterList);
			
			return "newsletter-page";
		}
		
	
		@RequestMapping("/newsletter-save")
		public String saveNewsletter(@Valid @ModelAttribute Newsletter newsletter, BindingResult result) {
			
			if (result.hasErrors()) {
				System.out.println("Ima gresaka........");
				return "newsletter-form";
			}
			
			newsletterDAO.saveNewsletter(newsletter);
			
			return "redirect:/administration/newsletter-list";
			
		}
		
		@RequestMapping("/newsletter-delete")
		public String deleteNewsletter(int id) {
			
			newsletterDAO.deleteNewsletter(id);
			
			return	"redirect:/administration/newsletter-list";
		}
		
		@RequestMapping("/newsletter-form-update")
		public String getNewsletterUpdateForm(@RequestParam int id, Model model) {
			
			Newsletter newsletter = newsletterDAO.getNewsletter(id);
			model.addAttribute("newsletter", newsletter);
			
			return "newsletter-form";
		}
		
		@RequestMapping("/newsletter-form")
		public String getNewsletterForm(Model model) {
			
			Newsletter newsletter = new Newsletter();
			model.addAttribute("newsletter", newsletter);
			
			return "newsletter-form";
		}

	
}
