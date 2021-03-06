package net.$51zhiyuan.development.kidbridge.service;

import com.github.pagehelper.PageRowBounds;
import net.$51zhiyuan.development.kidbridge.ui.model.Whirligig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 轮播图
 */
@Service
public class WhirligigService {

    private final Logger logger = LogManager.getLogger(UserService.class);

    private final String namespace = "net.$51zhiyuan.development.kidbridge.dao.whirligig.";

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public Whirligig get(Whirligig param){
        return this.sqlSessionTemplate.selectOne(this.namespace + "get",param);
    }

    public List<Whirligig> list(){
        return this.sqlSessionTemplate.selectList(this.namespace + "list");
    }

    public List<Whirligig> list(Whirligig param){
        return this.sqlSessionTemplate.selectList(this.namespace + "list",param);
    }

    public List<Whirligig> list(Object param, PageRowBounds page) {
        return this.sqlSessionTemplate.selectList(this.namespace + "list",param,page);
    }

}
