import csv
import sys
if len(sys.argv) < 3 :
    sys.exit("TOO FEW COMMAND-LINE ARGUMENTS")
elif len(sys.argv ) > 3:
    sys.exit("TOO MANY COMAMND-LINE ARGUMENTS")
elif sys.argv[1].endswith(".csv") == False:
    sys.exit("second input is not a csv file")
elif sys.argv[2].endswith(".csv") == False:
    sys.exit("third input is not a csv file")
else:
    try :
        with open(sys.argv[1]) as file:
            reader = csv.DictReader(file)
            with open(sys.argv[2],"w", newline='') as file1:
                writer = csv.DictWriter(file1, fieldnames=["first", "last", "house"])
                writer.writeheader()
                for row in reader:
                    a = row["name"].split(sep=",")
                    last, first = a
                    writer.writerow({"first": first.lstrip(),"last": last,"house": row["house"]})

    except FileNotFoundError:
        print("Could not read invalid_file.csv")
