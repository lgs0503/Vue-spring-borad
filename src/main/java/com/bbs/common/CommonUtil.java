package com.bbs.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import com.bbs.vo.BoardGridSearchVO;

@Component
public class CommonUtil {

	private static final Logger LOG = LoggerFactory.getLogger(CommonUtil.class);
	
	public static final int REQUEST_SUCCESS = 1;
	public static final int REQUEST_ERROR = 0;

	public static BoardGridSearchVO setPagingData(BoardGridSearchVO boardGridSearchVO) {
		
		int rows = boardGridSearchVO.getRows();
		int page = boardGridSearchVO.getPage();
		
		boardGridSearchVO.setStartRow(page == 1 ? 1 : ((page-1) * rows)+1);
		boardGridSearchVO.setEndRow(page * rows);
		
		return boardGridSearchVO;
		
	}
	
	public static int stringToInteger(String string) {
		return Integer.parseInt(string);
	}
}