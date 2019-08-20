public class Survey
{
	public SurveyState _openedSurvey;
	public SurveyState _closedSurvey;
	public SurveyState _createdSurvey;
	public SurveyState _currentState;

	public Survey() 
	{
		_openedSurvey = new OpenedSurveyState(this);
		_closedSurvey = new ClosedSurveyState(this);
		_createdSurvey = new CreatedSurveyState(this);
		_currentState = _createdSurvey;
	}
	
	public SurveyState getClosedSurveyState() { return _closedSurvey; }
	public SurveyState getOpenedSurveyState() { return _openedSurvey; }

	public void setSurveyState(SurveyState state) {
		_currentState = state;
	}

	public void openSurvey() {
		_currentState.openSurvey();
	}
	
	public void closeSurvey() {
		_currentState.closeSurvey();
	}

	public void getCurrentStateInfo() { _currentState.getCurrentState(); }

}

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

public interface SurveyState
{
	void openSurvey();
	void closeSurvey();
	void getCurrentState();
}

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