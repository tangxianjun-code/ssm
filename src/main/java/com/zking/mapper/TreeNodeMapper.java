package com.zking.mapper;

import com.zking.model.TreeNode;

import java.util.List;

public interface TreeNodeMapper {
    int deleteByPrimaryKey(Long treeNodeId);

    int insert(TreeNode record);

    int insertSelective(TreeNode record);

    TreeNode selectByPrimaryKey(Long treeNodeId);

    int updateByPrimaryKeySelective(TreeNode record);

    int updateByPrimaryKey(TreeNode record);

    List<TreeNode> list(TreeNode treeNode);
}