import os

# os.system('clear')
print('\033c', end='')
os.chdir('..')

javaSections = os.listdir('codingbat/java/md')
javaSections.sort()
pythonSections = os.listdir('codingbat/python/md')
pythonSections.sort()

codingbatJava = {}
codingbatPython = {}

for section in javaSections:
    fileNames = os.listdir('codingbat/java/md/'+section)
    codingbatJava[section] = [section]
    # print(section)
    for fileName in fileNames:
        if(fileName != 'README.md'):
            # print(' \u221f '+fileName)
            codingbatJava[section].append(fileName)

for section in pythonSections:
    fileNames = os.listdir('codingbat/python/md/'+section)
    codingbatPython[section] = [section]
    # print(section)
    for fileName in fileNames:
        if(fileName != 'README.md'):
            # print(' \u221f '+fileName)
            codingbatPython[section].append(fileName)

readme = '''# Programming Practice

My solutions to programming practice problems.

## CodingBat

***
'''

for section in javaSections:
    sectText = '<details>\n<summary>'+section+'</summary>\n'
    sectText += '\n#### java\n\n'

    fileNames = os.listdir('codingbat/java/md/'+section)
    for fileName in fileNames:
        sectText += '- ['+fileName+'](/codingbat/java/md/'+section+'/'+fileName+')\n'

    if section in pythonSections:
        sectText += '\n#### python\n\n'
        fileNames = os.listdir('codingbat/java/md/'+section)
        for fileName in fileNames:
            sectText += '- ['+fileName+'](/codingbat/python/md/'+section+'/'+fileName+')\n'

    sectText += '</details>\n\n***\n'
    readme+=sectText




f = open('README.md', 'w')
f.write(readme)
f.close()
print('done')