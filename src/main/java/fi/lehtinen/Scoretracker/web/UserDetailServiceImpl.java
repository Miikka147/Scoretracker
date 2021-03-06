package fi.lehtinen.Scoretracker.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import fi.lehtinen.Scoretracker.domain.Usr;
import fi.lehtinen.Scoretracker.domain.UsrRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService  {
	private final UsrRepository repository;

	@Autowired
	public UserDetailServiceImpl(UsrRepository userRepository) {
		this.repository = userRepository;
	}

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {   
    	Usr curruser = repository.findByUsername(username);
        UserDetails user = new org.springframework.security.core.userdetails.User(username, curruser.getPasswordHash(), 
        		AuthorityUtils.createAuthorityList(curruser.getRole()));
        return user;
    }   
} 