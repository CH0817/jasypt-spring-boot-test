package tw.com.rex.jasyptspringboottest.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tw.com.rex.jasyptspringboottest.entity.UserInfo;
import tw.com.rex.jasyptspringboottest.repository.UserInfoRepository;
import tw.com.rex.jasyptspringboottest.service.TestService;

import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class TestServiceImpl implements TestService {

    private final UserInfoRepository repository;

    @Override
    public String insert(UserInfo userInfo) {
        return repository.save(userInfo).getId();
    }

    @Override
    public UserInfo findById(String id) {
        return repository.findById(id).get();
    }

    @Override
    public List<UserInfo> findAll() {
        return repository.findAll();
    }

}
