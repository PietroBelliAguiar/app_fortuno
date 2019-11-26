package br.com.sempreit_fortuno.steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( 
	snippets = SnippetType.CAMELCASE,
	features = {"classpath:features"},
	glue = {"br.com.sempreit_fortuno"},
	tags = {"@android","@REG-404"}
)
public class RunnerTest {
	
} 