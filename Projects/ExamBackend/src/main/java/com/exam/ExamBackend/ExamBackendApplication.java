package com.exam.ExamBackend;

import com.exam.ExamBackend.entity.Roles;
import com.exam.ExamBackend.entity.UserRoles;
import com.exam.ExamBackend.entity.Users;
import com.exam.ExamBackend.repo.UserRepo;
import com.exam.ExamBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamBackendApplication implements CommandLineRunner {

	@Autowired
	UserService userService;@Autowired
	private UserRepo userRepo;

	public static void main(String[] args) {
		SpringApplication.run(ExamBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Default run");

		Users userAlreadyExist = userRepo.findByUsername("sourav78");

		if (userAlreadyExist != null) {
			return;
		}

		Users user = new Users();
		user.setFirstName("SouravRanjan");
		user.setLastName("Ranjan");
		user.setUsername("sourav78");
		user.setPassword("sourav78");
		user.setEmail("sourav78@gmail.com");
		user.setPhone("7854126396");
		user.setProfile("default.png");

		Roles roles = new Roles();
		roles.setRoleId(11l);
		roles.setRoleName("ADMIN");

		Set<UserRoles> userRolesSet = new HashSet<>();

		UserRoles userRoles = new UserRoles();
		userRoles.setUser(user);
		userRoles.setRole(roles);

		userRolesSet.add(userRoles);

		Users SavedUser = userService.createUser(user, userRolesSet);

		System.out.println(SavedUser);
	}
}
