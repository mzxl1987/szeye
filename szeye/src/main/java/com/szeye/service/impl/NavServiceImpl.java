package com.szeye.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.szeye.dto.Result;
import com.szeye.entity.SysNav;
import com.szeye.service.NavService;

@Service
@Transactional(rollbackOn = Exception.class)
public class NavServiceImpl implements NavService {

	public Object index() {
		Result result = Result.getSuccessResult();

		return result;
	}

	private SysNav createNavItem(String id,boolean expanded,String iconCls,boolean leaf,String parentId,boolean selectable,String text,String viewType) {
		
		SysNav nav = new SysNav();
		nav.setId(id);
		nav.setExpanded(expanded);
		nav.setIconCls(iconCls);
		nav.setLeaf(leaf);
		nav.setParentId(parentId);
		nav.setRowCls("nav-tree-badge");
		nav.setSelectable(selectable);
		nav.setText(text);
		nav.setViewType(viewType);
		
		return nav;
	}
	
	@Override
	public Object query() {
		
		Result result = Result.getSuccessResult();

		List<SysNav> sysNavs = new ArrayList<SysNav>();
		
		sysNavs.add(createNavItem("10001",false, "x-fa fa-list", false, null, false, "系统管理", null));
		sysNavs.add(createNavItem("11001",false, "x-fa fa-user", true, "10001", true, "管理员管理", "admins"));
		
		List<SysNav> data = new ArrayList<>();
		Iterator<SysNav> it = sysNavs.iterator();
		while(it.hasNext()) {
			SysNav nav = it.next();
			if(!nav.isLeaf() && (nav.getParentId() == null || "".equals(nav.getParentId()))) {
				data.add(nav);
				it.remove();
			}
		
		}
		
		for(SysNav nav : sysNavs) {
			for(SysNav parent : data) {
				if(parent.getId().equals(nav.getParentId())) {
					if(parent.getChildren() == null) {
						parent.setChildren(new ArrayList<>());
					}
					parent.getChildren().add(nav);
				}else if(null != parent.getChildren()) {
					for(SysNav subChildren : parent.getChildren()) {
						if(subChildren.getId().equals(nav.getParentId())) {
							if(null == subChildren.getChildren()) {
								subChildren.setChildren(new ArrayList<>());
							}
							subChildren.getChildren().add(nav);
						}
					}
				}
			}
		}
		
		result.setData(data);

		return result;
	}
}
