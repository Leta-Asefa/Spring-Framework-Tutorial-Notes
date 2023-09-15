package com.Leta.MainPackage;

import org.springframework.context.annotation.Primary;

@org.springframework.stereotype.Component

public class Intel implements MicroProcessor {

	public Intel() {
	}

	@Override
	public String getProcessorRank() {
		return "The first processor";
	}

}
