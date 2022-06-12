package org.juliagift.copayprogram.packageA;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.juliagift.copayprogram.entity.Claim;
import org.juliagift.copayprogram.service.ClaimService;
import org.juliagift.copayprogram.service.ClaimServiceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClaimServiceTests {
	
	private static ClaimService claimService;
	
	@BeforeAll
	public static void setUpBefore() {
		claimService = new ClaimServiceImpl();
		System.out.println("Test data set up is completed");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("Before each is executed");
	}
	
	
	@DisplayName("JUnit test for getAllClaims method")
	@Test
	public void testGetAllClaims() {
		System.out.println("here");
		List<Claim> claims = claimService.getAllClaims();
		System.out.println(claims);
		assertFalse(claims.isEmpty());
		assertEquals(13, claims.size());
	}
	

	
	@AfterEach
	public void tearDown() {
		System.out.println("After each is executed");
	}
	
	@AfterAll
	public static void tearDownAfter() {
		System.out.println("All tests are completed");
	}

}
