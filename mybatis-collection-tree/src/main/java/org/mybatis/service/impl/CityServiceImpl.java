package org.mybatis.service.impl;

import org.mybatis.dao.NodeDao;
import org.mybatis.domain.Node;
import org.mybatis.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 节点业务逻辑实现类
 *
 * Created by bysocket on 24/01/2018.
 */
@Service
public class CityServiceImpl implements NodeService {

    @Autowired
    private NodeDao nodeDao;

    @Override
    public List<Node> getNodeTree() {
        return nodeDao.getNodeTree();
    }
}
