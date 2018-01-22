package py.org.fundacionparaguaya.pspserver.web.rest;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import py.org.fundacionparaguaya.pspserver.security.services.PasswordResetTokenService;

@RestController
@RequestMapping(value = "/password")
public class PasswordResetTokenController {
	
	private static final Logger LOG = LoggerFactory.getLogger(PasswordResetTokenController.class);

	private PasswordResetTokenService passwordResetTokenService;
	
	public PasswordResetTokenController(PasswordResetTokenService passwordResetTokenService) {
		this.passwordResetTokenService = passwordResetTokenService;
	}

	@PostMapping("/resetPassword")
	public ResponseEntity<?> resetPassword(
			HttpServletRequest request,  
			@RequestParam("email") String userEmail) {
		passwordResetTokenService.resetPassword(request, userEmail);
        return ResponseEntity.noContent().build();
	}
	
	@PostMapping("/changePassword")
	public ResponseEntity<?> showChangePasswordPage(
			@RequestParam("token") String token, 
			@RequestParam("userId") Long userId,
			@RequestParam("temporalPassword") String temporalPassword,
			@RequestParam("password") String password,
			@RequestParam("repeatPassword") String repeatPassword) {
	    passwordResetTokenService.validatePasswordResetToken(token, userId, temporalPassword, password, repeatPassword);	   
	    return ResponseEntity.noContent().build();
	}
	
}