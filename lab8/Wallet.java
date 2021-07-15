public class Wallet{
    int twenties = 0;
    int tens = 0;
    int fives = 0;
    int ones = 0;

    public Wallet(){
    }


    public Wallet(int twenties, int tens, int fives, int ones){
        this.twenties = twenties;
        this.tens = tens;
        this.fives = fives;
        this.ones = ones;
    }

    public void add(int twenties, int tens, int fives, int ones){
        this.twenties += twenties;
        this.tens += tens;
        this.fives += fives;
        this.ones += ones;
    }

    public void add(Wallet wallet){
        this.twenties += wallet.twenties;
        this.tens += wallet.tens;
        this.fives += wallet.fives;
        this.ones += wallet.ones;
        
        wallet.subtract(wallet.twenties, wallet.tens, wallet.fives, wallet.ones);
    }

    public Wallet subtract(int amountToSubtract){
        if( amountToSubtract > getValue() ){
            System.out.println("Insufficient funds - purchase denied");
        }
        else{
            amountToBills(amountToSubtract);
	}
        return this;
    }


    private void subtract(int twenties, int tens, int fives, int ones){
        this.twenties -= twenties;
        this.tens -= tens;
        this.fives -= fives;
        this.ones -= ones;
    }

    private void  amountToBills(int amount){
        while( amount % 5 == 0 && amount != 0 ){
	    if( amount >= 20 && this.twenties > 1 ){
		this.twenties--;
		amount -= 20;
	    }
	    if( amount >= 10 && this.tens > 1  ){
		this.tens--;
		amount -=  10;
	    }
	    if( amount >= 5 && this.fives > 1 ){
		this.fives--;
		amount -= 5;
	    }
	}

	if( amount >= 20 && this.twenties > 0 ){
	    this.twenties--;
	    amount -= 20;
	}
	if( amount >= 10 && this.tens > 0  ){
	    this.tens--;
	    amount -=  10;
	}
	if( amount >= 5 && this.fives > 0 ){
	    this.fives--;
	    amount -= 5;
	}


	if(  this.ones >= amount   ){
            this.ones -= amount;
	}
        else if(this.ones < amount){
            if(this.fives > 0){
                this.fives--;
                int remainder = 5 % amount;
                this.ones += remainder;
            }
        }

    }
    
    public void printContents(){
        System.out.println("twenties = " + twenties + ", tens = " + tens + ", fives = " + fives + ", ones = " + ones);
    }

    public int getValue(){
         return (twenties * 20) + (tens * 10) + (fives * 5) + ones;
    }
    
    public void compare(Wallet toCompare){
       System.out.println("current = " + getValue() + ", toCompare = " + toCompare.getValue() );
        if(toCompare.getValue() > getValue()){
            System.out.println("IS LESS THAN");
        }
        else if(toCompare.getValue() < getValue()){
            System.out.println("IS GREATER THAN");
        }
        else if(toCompare.getValue() == getValue()){
            System.out.println("IS EQUAL TO");
        }
    }
}

