package com.sopra.gitlabBuild;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GitlabBuild {
	
	@Builder.Default long id = System.currentTimeMillis();
	
	public static void main(String[] args) {
		
		System.out.println(GitlabBuild.builder()
				.build());
	}

}
