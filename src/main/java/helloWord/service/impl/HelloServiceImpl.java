package helloWord.service.impl;

import helloWord.dao.IHelloDao;
import helloWord.entity.Text;
import helloWord.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements IHelloService {
    @Autowired
    IHelloDao helloDao;

    public Text getText() {
        return helloDao.getText();
    }
}
