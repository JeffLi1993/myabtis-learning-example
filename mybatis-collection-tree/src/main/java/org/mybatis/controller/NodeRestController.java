package org.mybatis.controller;

import org.mybatis.domain.Node;
import org.mybatis.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 节点业务控制成类
 *
 * Created by bysocket on 24/01/2018.
 */
@RestController
public class NodeRestController {

    @Autowired
    private NodeService nodeService;

    @GetMapping(value = "/node/tree")
    public List<Node> getNodeTree() {
        return nodeService.getNodeTree();
    }

}
