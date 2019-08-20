public class CreatedSurveyState implements SurveyState
{
	public Survey _survey;	

	CreatedSurveyState(Survey survey) {
		_survey = survey;
	}
	
	public void openSurvey() {
		_survey.setSurveyState(_survey.getOpenedSurveyState());
	}
	
	public void closeSurvey() {
		System.out.println("The survey hasn't been open yet.");
	}

	public void getCurrentState() { 
		System.out.println("The survey hasn't been open yet.");
	}	

}