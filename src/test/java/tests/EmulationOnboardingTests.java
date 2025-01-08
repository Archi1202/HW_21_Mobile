package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import screens.SearchScreen;
import screens.components.IntroComponent;

@Tag("emulation")
@Owner("Anuar Zhangeldi")
@DisplayName("Tests for Wikipedia Onboarding Screens")

public class EmulationOnboardingTests extends TestBase{
    public final IntroComponent introComponent = new IntroComponent();

    public final SearchScreen searchScreen = new SearchScreen();

    @DisplayName("Successful verification of Onboarding Screens")
    @Test
    public void SuccessfulOnboardingTest(){
        introComponent.verifyTitleOnTheScreen("The Free Encyclopedia")
                .clickOnContinueButton()
                .verifyTitleOnTheScreen("New ways to explore")
                .clickOnContinueButton()
                .verifyTitleOnTheScreen("Reading lists with sync")
                .clickOnContinueButton()
                .verifyTitleOnTheScreen("Data & Privacy")
                .clickOnGetStarted();
        searchScreen.checkAnnoncementText("Customize your Explore feed");

    }
}