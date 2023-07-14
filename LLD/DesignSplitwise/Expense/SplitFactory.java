package LowLevelDesign.DesignSplitwise.Expense;

import LowLevelDesign.DesignSplitwise.Expense.Split.EqualExpenseSplit;
import LowLevelDesign.DesignSplitwise.Expense.Split.ExpenseSplit;
import LowLevelDesign.DesignSplitwise.Expense.Split.PercentageExpenseSplit;
import LowLevelDesign.DesignSplitwise.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }
}
