package tw.com.rex.jasyptspringboottest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tw.com.rex.jasyptspringboottest.entity.UserInfo;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, String> {
}
