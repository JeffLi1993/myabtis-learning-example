package org.mybatis.dao;

import org.mybatis.domain.Node;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 节点 DAO 接口类
 *
 * Created by bysocket on 24/01/2018.
 */
@Component
public interface NodeDao {

    /**
     * 获取节点树
     */
    List<Node> getNodeTree();
}
