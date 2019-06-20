package com.nt.service;

import com.nt.external.ICCScoreComp;

public class CrickBuzzGetScoreServiceImpl implements CrickBuzzGetScoreService {
	private ICCScoreComp extService;

	public void setExtService(ICCScoreComp extService) {
		this.extService = extService;
	}

	@Override
	public String getScore(int mid) {// TODO Auto-generated method stub
		String scoreCard=null;
		//use Extenal Service 
		scoreCard=extService.fetchScore(mid);
		return scoreCard;
	}

}
