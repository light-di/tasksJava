package homework;

public abstract class ParseNumber {
	
	public static boolean isBetween(int x, int lower, int upper) {
		  return (lower <= x && x <= upper);
		}
	
	public static String parseNumber(int number) {
		if (number == 0) return("zero");
		if (isBetween((number/10), 0, 1)) { //1-19
			return(parseSimpleNum(number));
		}
		else if (isBetween((number/10), 2, 9)) { //20-99
			return(parseTwoDig(number));
		}
		else if (isBetween((number/10), 10, 99)){ //100-999
			return(parseThreeDig(number));
		}
		else if (isBetween((number/10), 100, 99999)){ //1000-999 999
			return(parseThousend(number));
		}
		else if (isBetween((number/10), 100000, 99999999)){ //1 000 000-999 999 999
			return(parseMillion(number));
		}
		else if (isBetween((number/10), 100000000, 214748364)){ //1 000 000 000-2 147 483 647
			return(parseBillion(number));
		}
		else return ("Can't parse");
	}
	
	public static String parseSimpleNum(int simpleNum) {
		switch (simpleNum) {
			case 1: 
				return("one");
			case 2: 
				return("two");
			case 3: 
				return("three");
			case 4: 
				return("four");
			case 5: 
				return("five");
			case 6: 
				return("six");
			case 7: 
				return("seven");
			case 8: 
				return("eight");
			case 9: 
				return("nine");
			case 10: 
				return("ten");
			case 11: 
				return("eleven");
			case 12: 
				return("twelve");
			case 13: 
				return("thirteen");
			case 14: 
				return("fourteen");
			case 15: 
				return("fifteen");
			case 16: 
				return("sixteen");
			case 17: 
				return("seventeen");
			case 18: 
				return("eighteen");
			case 19: 
				return("nineteen");
			default:
				return ("");
		}
	}
	public static String parseTwoDig(int twoDigNum) {
		switch (twoDigNum/10) {
			case 2://20-29
				return(("twenty " + parseSimpleNum(twoDigNum%10)).trim());
			case 3://30-39
				return(("thirty " + parseSimpleNum(twoDigNum%10)).trim());
			case 4://40-49
				return(("forty " + parseSimpleNum(twoDigNum%10)).trim());
			case 5://50-59
				return(("fifty " + parseSimpleNum(twoDigNum%10)).trim());
			case 6://60-69
				return(("sixty " + parseSimpleNum(twoDigNum%10)).trim());
			case 7://70-79
				return(("seventy " + parseSimpleNum(twoDigNum%10)).trim());
			case 8://80-89
				return(("eighty " + parseSimpleNum(twoDigNum%10)).trim());
			case 9://90-99	
				return(("ninety " + parseSimpleNum(twoDigNum%10)).trim());
			default:
				return ("");
		}
	}
	
	public static String parseThreeDig(int threeDigNum) {
		if (threeDigNum > 99 & threeDigNum < 1000)
			return((parseSimpleNum(threeDigNum/100) + " hundred " + parseSimpleNum(threeDigNum%100) + parseTwoDig(threeDigNum%100)).trim());
		else return ("");
		}
	public static String parseThousend(int thousendNum) {
		if (thousendNum > 999999 | thousendNum < 1000) return ("");
		if (thousendNum/1000 < 20) {
			return((parseSimpleNum(thousendNum/1000) + " thousand " + parseSimpleNum(thousendNum%1000) + parseTwoDig(thousendNum%1000) + parseThreeDig(thousendNum%1000)).trim());
		}
		else if (thousendNum/1000 < 100)
			return((parseTwoDig(thousendNum/1000) + " thousand " + parseSimpleNum(thousendNum%1000) + parseTwoDig(thousendNum%1000) + parseThreeDig(thousendNum%1000)).trim());
		else 
			return((parseThreeDig(thousendNum/1000) + " thousand " + parseSimpleNum(thousendNum%1000) + parseTwoDig(thousendNum%1000) + parseThreeDig(thousendNum%1000)).trim());
	}
	
	public static String parseMillion(int millionNum) {
		if (millionNum > 999999999 | millionNum < 1000000) return ("");
		if (millionNum/1000000 < 20)
			return((parseSimpleNum(millionNum/1000000) + " million " + parseSimpleNum(millionNum%1000000) + parseTwoDig(millionNum%1000000) + parseThreeDig(millionNum%1000000) + parseThousend(millionNum%1000000)).trim());
		else if (millionNum/1000000 < 100)
			return((parseTwoDig(millionNum/1000000) + " million " + parseSimpleNum(millionNum%1000000) + parseTwoDig(millionNum%1000000) + parseThreeDig(millionNum%1000000) + parseThousend(millionNum%1000000)).trim());
		else 
			return((parseThreeDig(millionNum/1000000) + " million " + parseSimpleNum(millionNum%1000000) + parseTwoDig(millionNum%1000000) + parseThreeDig(millionNum%1000000) + parseThousend(millionNum%1000000)).trim());
	}
	
	public static String parseBillion(int billionNum) {
		if (billionNum > 2147483647 | billionNum < 1000000000) return ("");
		if (billionNum/1000000000 < 20)
			return((parseSimpleNum(billionNum/1000000000) + " billion " + parseSimpleNum(billionNum%1000000000) + parseTwoDig(billionNum%1000000000) + parseThreeDig(billionNum%1000000000) + parseThousend(billionNum%1000000000) + parseMillion(billionNum%1000000000)).trim());
		else if (billionNum/1000000000 < 100)
			return((parseTwoDig(billionNum/1000000000) + " billion " + parseSimpleNum(billionNum%1000000000) + parseTwoDig(billionNum%1000000000) + parseThreeDig(billionNum%1000000000) + parseThousend(billionNum%1000000000) + parseMillion(billionNum%1000000000)).trim());
		else 
			return((parseThreeDig(billionNum/1000000000) + " billion " + parseSimpleNum(billionNum%1000000000) + parseTwoDig(billionNum%1000000000) + parseThreeDig(billionNum%1000000000) + parseThousend(billionNum%1000000000) + parseMillion(billionNum%1000000000)).trim());
	}
	

}
