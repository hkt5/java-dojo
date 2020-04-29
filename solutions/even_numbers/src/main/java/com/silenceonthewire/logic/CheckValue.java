package com.silenceonthewire.logic;

import com.silenceonthewire.data.DecisionDictionary;

public class CheckValue implements NumberDecidable {

    private CheckIsEven checkIsEven = new CheckIsEven();
    private CheckIsPositive checkIsPositive = new CheckIsPositive();
    private DecisionDictionary decisionDictionary = new DecisionDictionary();

    @Override
    public String getNumberType(int number) {

        String decision = null;

        if(this.checkIsEven.check(number) && this.checkIsPositive.check(number)){

            decision = this.decisionDictionary.isEvenAndPositive;
        } else if(!this.checkIsEven.check(number) && this.checkIsPositive.check(number)){

            decision = this.decisionDictionary.isNotEvenAndPositive;
        } else if(this.checkIsEven.check(number) && !this.checkIsPositive.check(number)) {

            decision = this.decisionDictionary.isEvenAndNegative;
        } else if(!this.checkIsEven.check(number) && !this.checkIsPositive.check(number)){

            decision = this.decisionDictionary.isNotEvenAndNegative;
        }

        return decision;
    }
}
