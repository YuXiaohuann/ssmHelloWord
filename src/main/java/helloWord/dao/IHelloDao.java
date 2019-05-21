package helloWord.dao;

import helloWord.entity.Text;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface IHelloDao {
    public Text getText();
}
