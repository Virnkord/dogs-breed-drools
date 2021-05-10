package com.virnkord.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.drools.compiler.compiler.DroolsParserException;
import org.drools.compiler.compiler.PackageBuilder;
import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import com.virnkord.model.Dog;

public class App {

	public static void main(String[] args) throws DroolsParserException,
			IOException {
		App app = new App();
		app.executeDrools();
	}

	public void executeDrools() throws DroolsParserException, IOException {

		PackageBuilder packageBuilder = new PackageBuilder();

		String ruleFile = "/com/rule/Rules.drl";
		InputStream resourceAsStream = getClass().getResourceAsStream(ruleFile);

		Reader reader = new InputStreamReader(resourceAsStream);
		packageBuilder.addPackageFromDrl(reader);
		org.drools.core.rule.Package rulesPackage = packageBuilder.getPackage();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(rulesPackage);

		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		Dog dog4 = new Dog();
		
		//английский бульдог
		dog1.setHair("короткошерстная");
		dog1.setHeight(15);
		dog1.setTail("короткий");
		
		//фоксхаунд
		dog2.setHair("короткошерстная");
		dog2.setHeight(75);
		dog2.setWeight(40);

		//колли
		dog4.setHair("длинношерстная");
		dog4.setHeight(60);
		dog4.setEars("короткие");

		workingMemory.insert(dog1);
		workingMemory.insert(dog2);
		workingMemory.insert(dog3);
		workingMemory.insert(dog4);
		
		workingMemory.fireAllRules();

		System.out.println("Порода собаки 1: " + dog1.getBreed());
		System.out.println("Порода собаки 2: " + dog2.getBreed());
		System.out.println("Порода собаки 3: " + dog3.getBreed());
		System.out.println("Порода собаки 4: " + dog4.getBreed());
	}

}
