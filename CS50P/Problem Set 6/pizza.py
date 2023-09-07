import sys
import csv
import tabulate
if len(sys.argv) < 2 :
    sys.exit("TOO FEW COMMAND-LINE ARGUMENTS")
elif len(sys.argv ) > 2:
    sys.exit("TOO MANY COMAMND-LINE ARGUMENTS")
elif sys.argv[1].endswith(".csv") == False:
    sys.exit("Not a csv file")
else:
    try :
        a =[]
        with open(f"{sys.argv[1]}",) as file:
            for line in csv.reader(file):
                a.append(line)
            print(tabulate.tabulate(a, tablefmt="grid"))


    except (FileNotFoundError):
        print("File does not exit")
