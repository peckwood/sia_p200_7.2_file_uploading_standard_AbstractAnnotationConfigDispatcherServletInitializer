package spittr.web;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.io.File;
import java.io.IOException;

import javax.servlet.FilterRegistration;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class FileUploadController {

	@RequestMapping(method = GET)
	public String showRegistrationForm() {
		return "registerForm";
	}

	@RequestMapping(method = POST)
	public String processRegistration(
			@RequestPart("profilePicture1") MultipartFile profilePicture1,
			@RequestPart("profilePicture2") MultipartFile profilePicture2, 
			String firstName)
			throws IllegalStateException, IOException {
		System.out.println("fistName: " + firstName);
		
		System.out.println("profilePicture1.isEmpty() " + profilePicture1.isEmpty());
		System.out.println("profilePicture1.getName(): " + profilePicture1.getName());
		System.out.println("profilePicture1.getOriginalFilename() " + profilePicture1.getOriginalFilename());
		System.out.println("profilePicture1.getContentType(): " + profilePicture1.getContentType());
		System.out.println("profilePicture1.getSize() " + profilePicture1.getSize());
		profilePicture1.transferTo(new File("D:/d/data/temp/profile_picture/" + profilePicture1.getOriginalFilename()));
		
		System.out.println("profilePicture2.isEmpty() " + profilePicture2.isEmpty());
		System.out.println("profilePicture2.getName(): " + profilePicture2.getName());
		System.out.println("profilePicture2.getOriginalFilename() " + profilePicture2.getOriginalFilename());
		System.out.println("profilePicture2.getContentType(): " + profilePicture2.getContentType());
		System.out.println("profilePicture2.getSize() " + profilePicture2.getSize());
		profilePicture2.transferTo(new File("D:/d/data/temp/profile_picture/" + profilePicture2.getOriginalFilename()));
		return "successfully_uploaded_check_terminal";
	}

}
