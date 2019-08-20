public class ClosedSurveyState implements SurveyState
{

	public Survey _survey;

	public ClosedSurveyState(Survey survey) {
		_survey = survey;
	}
	
	public void openSurvey() {
		System.out.println("The survey has been opened.");
		_survey.setSurveyState(_survey.getOpenedSurveyState());
	}
	
	public void closeSurvey() {
		System.out.println("The survey is already closed.");
	}

	public void getCurrentState() { 
		System.out.println("The survey is currently closed."); 
	}
}