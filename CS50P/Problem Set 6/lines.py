import sys
if len(sys.argv) < 2 :
    sys.exit("TOO FEW COMMAND-LINE ARGUMENTS")
elif len(sys.argv ) > 2:
    sys.exit("TOO MANY COMAMND-LINE ARGUMENTS")
elif sys.argv[1].endswith(".py") == False:
    sys.exit("Not a python file")
else:
    try:
        with open(sys.argv[1],"r") as file:
            counter = 0
            for line in file:
                if line.strip().startswith("#") or line.startswith('"""'):
                    continue
                elif line.isspace():
                    continue
                else:
                    counter += 1

    except FileNotFoundError:
        sys.exit("File does not exist")
    else:
        print(counter)