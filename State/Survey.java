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