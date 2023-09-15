package com.Leta.MainPackage;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuadCore implements MicroProcessor{

	public QuadCore() {
	}

	@Override
	public String getProcessorRank() {
		return "The second processor";
		}

}
