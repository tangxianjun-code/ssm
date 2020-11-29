package com.zking.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TreeNode {
    private Long treeNodeId;

    private String treeNodeName;

    private Long treeNodeType;

    private Long position;

    private Long parentNodeId;

    private String url;

    private String icon;

    private Long treeNodeAffiliation;

    private List<TreeNode> treeNodeList=new ArrayList<>();

    public TreeNode(Long treeNodeId, String treeNodeName, Long treeNodeType, Long position, Long parentNodeId, String url, String icon, Long treeNodeAffiliation) {
        this.treeNodeId = treeNodeId;
        this.treeNodeName = treeNodeName;
        this.treeNodeType = treeNodeType;
        this.position = position;
        this.parentNodeId = parentNodeId;
        this.url = url;
        this.icon = icon;
        this.treeNodeAffiliation = treeNodeAffiliation;
    }

    public TreeNode() {
        super();
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public String getTreeNodeName() {
        return treeNodeName;
    }

    public void setTreeNodeName(String treeNodeName) {
        this.treeNodeName = treeNodeName;
    }

    public Long getTreeNodeType() {
        return treeNodeType;
    }

    public void setTreeNodeType(Long treeNodeType) {
        this.treeNodeType = treeNodeType;
    }

    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public Long getParentNodeId() {
        return parentNodeId;
    }

    public void setParentNodeId(Long parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getTreeNodeAffiliation() {
        return treeNodeAffiliation;
    }

    public void setTreeNodeAffiliation(Long treeNodeAffiliation) {
        this.treeNodeAffiliation = treeNodeAffiliation;
    }
}