# kotlin_app

this app is just for fun

# ListView
''' python
jiangj=[1000000,132076,5332,200,10,5]

def printDajiang(num):
    print(str(num+1)+"等奖中奖数量："+str(len(arr[num]))+" 奖金总计："+str(len(arr[num]) * jiangj[num]))
def total(num, alljj):
    alljj = int(alljj) + int(len(arr[num]) * jiangj[num])
    return alljj

con = psycopg2.connect(database='db', user='user', password="pwd", host='ip')
cur = con.cursor()
version = "18126"
sql = "select r1,r2,r3,r4,r5,b1,b2 from dlt where version='{0}'"

cur.execute(sql.format(version))
all = cur.fetchall()
dtin = ('11', '13', '15', '21', '27', '5', '6');
zjpp = {(5, 2): "1",
        (5, 1): "2",
        (5, 0): "3",
        (4, 2): "3",
        (4, 1): "4",
        (3, 2): "4",
        (4, 0): "5",
        (3, 1): "5",
        (2, 2): "5",
        (3, 0): "6",
        (1, 2): "6",
        (2, 1): "6",
        (0, 2): "6"
        }
arr = [[] for x in range(6)]
for item in all:
    rnum = 0
    bnum = 0

    for tb in range(len(item)):

            if tb < 5:
                for i in range(5):
                    if item[tb] == dtin[i]:
                        rnum = rnum + 1
            else:
                for i in range(5,7):
                    if item[tb] == dtin[i]:
                         bnum = bnum + 1
    zp = zjpp.get((rnum, bnum))
    if zp is not None:
        if zp == "1":
            arr[0].append(str(item))

        if zp == "2":
            arr[1].append(str(item))

        if zp == "3":
            arr[2].append(str(item))

        if zp == "4":
            arr[3].append(str(item))

        if zp == "5":
            arr[4].append(str(item))

        if zp == "6":
            arr[5].append(str(item))

print("购买金额："+str(len(all)*2))
for x in range(6):
    path = r"C:\Users\22\Desktop\to\{0}\{1}.txt".format(version,str(x));
    printDajiang(x)
    # print(total(x,0))
    with open(path, "w+") as f:
        f.write(str(arr[x]))
        '''
