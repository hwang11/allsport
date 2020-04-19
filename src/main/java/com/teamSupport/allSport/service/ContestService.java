package com.teamSupport.allSport.service;

import com.teamSupport.allSport.dto.Contest;
import com.teamSupport.allSport.dto.PageMaker;
import com.teamSupport.allSport.dto.PagingResult;

public interface ContestService {
	public PageMaker getPageMaker(int totalCount, int page);
	public PagingResult findAllContest(int page);
	public Contest getContest(int idContest);
	public PagingResult search();
}
