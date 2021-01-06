public int interpret(int value, String[] commands, int[] args) {
  
  if(commands.length == 0 || args.length == 0)
    return -1;
  
  for(int i = 0; i < commands.length; i++) {

    if(commands[i].equals("+"))
      value += args[i];
    else if(commands[i].equals("-"))
      value -= args[i];
    else if(commands[i].equals("*"))
      value *= args[i];
    else {
      value = -1;
      break;
    }
    
  }

   return value;
}
