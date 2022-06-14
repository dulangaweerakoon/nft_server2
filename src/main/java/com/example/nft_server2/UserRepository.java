package com.example.nft_server2;
import org.springframework.data.repository.CrudRepository;

import com.example.nft_server2.User;

public interface UserRepository  extends CrudRepository<User, Integer>{
}
