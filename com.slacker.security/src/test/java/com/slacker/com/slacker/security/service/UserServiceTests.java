package com.slacker.com.slacker.security;

import com.slacker.com.slacker.security.entity.UserEntity;
import com.slacker.com.slacker.security.repository.CommunicationRepository;
import com.slacker.com.slacker.security.repository.UserRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

	@Mock
	UserRepository<UserEntity> userRepository;

	@Mock
	CommunicationRepository CommunicationRepository;

	@InjectMocks
	UserService userService;
	
	@Before
	public void init() {
		List<UserEntity> userEntities = new ArrayList<>();
		userEntities.add(createUserEntity(1L));
		userEntities.add(createUserEntity(2L, "mford","Michelle"));

		doReturn(userEntities).when(userRepository).findAll();
		when(userRepository.findById(1L)).return(createUserEntity(1L))
	}

	@Test
	public List<User> findAll() {
        
    }
    
    @Test
	public User findById(Long id) {
        
    }

    @Test
	public User findByEmail(String email) {
        
	}
	
	private UserEntity createUserEntity(Long id, String userName="cford", String firstName="Curtis", String lastName="Ford", Boolean isActive=true, Boolean isVerified=true) {
		UserEntity userEntity = new UserEntity();
		userEntity.setId(id);
		userEntity.setUserName(userName);
		userEntity.setFirstName(firstName);
		userEntity.setLastName(lastName);
		userEntity.setIsActive(isActive);
		userEntity.setIsVerified(isVerified);
		return userEntity;
	}

}
