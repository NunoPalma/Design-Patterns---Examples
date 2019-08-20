public class OpenedSurveyState implements SurveyState 
{
	public Survey _survey;

	public OpenedSurveyState(Survey survey) {
		_survey = survey;
	}
	
	public void openSurvey() {
		System.out.println("The survey is already open.");
	}
	
	public void closeSurvey() {
		System.out.println("The survey has been closed.");
		_survey.setSurveyState(_survey.getClosedSurveyState());
	}
	
	public void getCurrentState() { 
		System.out.println("The survey is currently open."); 
	}
	
}