package br.com.alura.leilao.acceptance.steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
// @CucumberOptions(features = "classpath:features")
@CucumberOptions(features = "classpath:features", tags = "@leilao") // tags @nomeTag para rodar apenas uma funcionalidade
public class LeilaoCucumberRunner {

}
