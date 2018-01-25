package org.mybatis.service;

import org.mybatis.domain.Node;

import java.util.List;

/**
 * 节点业务逻辑接口类
 *
 * Created by bysocket on 24/01/2018.
 */
public interface NodeService {

    /**
     * 获取节点树
     */
    List<Node> getNodeTree();
}
