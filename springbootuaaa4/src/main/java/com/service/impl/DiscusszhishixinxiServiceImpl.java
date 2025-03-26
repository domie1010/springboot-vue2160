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


import com.dao.DiscusszhishixinxiDao;
import com.entity.DiscusszhishixinxiEntity;
import com.service.DiscusszhishixinxiService;
import com.entity.vo.DiscusszhishixinxiVO;
import com.entity.view.DiscusszhishixinxiView;

@Service("discusszhishixinxiService")
public class DiscusszhishixinxiServiceImpl extends ServiceImpl<DiscusszhishixinxiDao, DiscusszhishixinxiEntity> implements DiscusszhishixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszhishixinxiEntity> page = this.selectPage(
                new Query<DiscusszhishixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszhishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszhishixinxiEntity> wrapper) {
		  Page<DiscusszhishixinxiView> page =new Query<DiscusszhishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusszhishixinxiVO> selectListVO(Wrapper<DiscusszhishixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusszhishixinxiVO selectVO(Wrapper<DiscusszhishixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusszhishixinxiView> selectListView(Wrapper<DiscusszhishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszhishixinxiView selectView(Wrapper<DiscusszhishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
