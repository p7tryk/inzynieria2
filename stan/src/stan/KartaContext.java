package stan;

public class KartaContext implements TypKarty {
	    private TypKarty typKarty;

	    public KartaContext(TypKarty typ){
	        typKarty=typ;
	    }

	    public void setTypKarty(TypKarty typKarty) {
	        this.typKarty = typKarty;
	    }

	    @Override
	    public void getState() {
	        typKarty.getState();
	    }
	}

