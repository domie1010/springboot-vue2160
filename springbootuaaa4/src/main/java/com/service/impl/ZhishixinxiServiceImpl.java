package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhishixinxiDao;
import com.entity.ZhishixinxiEntity;
import com.service.ZhishixinxiService;
import com.entity.vo.ZhishixinxiVO;
import com.entity.view.ZhishixinxiView;

@Service("zhishixinxiService")
public class ZhishixinxiServiceImpl extends ServiceImpl<ZhishixinxiDao, ZhishixinxiEntity> implements ZhishixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhishixinxiEntity> page = this.selectPage(
                new Query<ZhishixinxiEntity>(params).getPage(),
                new EntityWrapper<ZhishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhishixinxiEntity> wrapper) {
		  Page<ZhishixinxiView> page =new Query<ZhishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhishixinxiVO> selectListVO(Wrapper<ZhishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhishixinxiVO selectVO(Wrapper<ZhishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhishixinxiView> selectListView(Wrapper<ZhishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhishixinxiView selectView(Wrapper<ZhishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
