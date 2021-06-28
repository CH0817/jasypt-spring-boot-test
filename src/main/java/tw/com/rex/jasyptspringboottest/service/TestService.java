package tw.com.rex.jasyptspringboottest.service;

import tw.com.rex.jasyptspringboottest.entity.UserInfo;

import java.util.List;

public interface TestService {

    String insert(UserInfo userInfo);

    UserInfo findById(String id);

    List<UserInfo> findAll();

}
