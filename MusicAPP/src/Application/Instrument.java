package Application;

public enum Instrument {

		GUITAR("Chitara"),
		BASS("Bass"),
		DRUMS("Tobe"),
		VOICE("Voce");
		private String name;
		
		private Instrument(String name) {
			this.name=name;
		
	}
		
		public String getName() {
			return this.name;
		}

}
