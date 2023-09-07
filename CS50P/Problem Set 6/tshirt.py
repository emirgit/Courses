import csv
import sys
from PIL import Image,ImageOps
if len(sys.argv) < 3 :
    sys.exit("TOO FEW COMMAND-LINE ARGUMENTS")
elif len(sys.argv ) > 3:
    sys.exit("TOO MANY COMAMND-LINE ARGUMENTS")

else:
    try:
        image = Image.open(sys.argv[1])
    except FileNotFoundError:
        sys.exit("Input does not exist")
    image1 = Image.open("shirt.png")
    size = image1.size
    pretend = ImageOps.fit(image,size)
    pretend.paste(image1,image1)
    pretend.save(sys.argv[2])

