import os

# os.system('clear')
print('\033c', end='')
os.chdir('..')

# javaSections = os.listdir('codingbat/java-old')

# for section in javaSections:
#     mdFiles = os.listdir('codingbat/java-old/'+section)
#     if not os.path.exists('codingbat/java/src/'+section):
#         os.makedirs('codingbat/java/src/'+section)
#     if not os.path.exists('codingbat/java/md/'+section):
#         os.makedirs('codingbat/java/md/'+section)
#     for mdFileName in mdFiles:
#         if(mdFileName != 'README.md'):
#             f = open('codingbat/java-old/'+section+'/'+mdFileName, 'r')
#             mdFile = f.read()
#             srcF = open('codingbat/java/src/'+section+'/'+mdFileName.split('.md')[0]+'.java', 'w')
#             srcF.write(mdFile.split('```java')[1].split('```')[0][1:])
#             srcF.close()
#             mdF = open('codingbat/java/md/'+section+'/'+mdFileName, 'w')
#             mdF.write(mdFile+'\n\n> [< _back to readme_](/README.md)')
#             mdF.close()
#             print('written '+mdFileName)


pythonSections = os.listdir('codingbat/python-old')

for section in pythonSections:
    mdFiles = os.listdir('codingbat/python-old/'+section)
    if not os.path.exists('codingbat/python/src/'+section):
        os.makedirs('codingbat/python/src/'+section)
    if not os.path.exists('codingbat/python/md/'+section):
        os.makedirs('codingbat/python/md/'+section)
    for mdFileName in mdFiles:
        if(mdFileName != 'README.md'):
            f = open('codingbat/python-old/'+section+'/'+mdFileName, 'r')
            mdFile = f.read()
            srcF = open('codingbat/python/src/'+section+'/'+mdFileName.split('.md')[0]+'.py', 'w')
            srcF.write(mdFile.split('```python')[1].split('```')[0][1:])
            srcF.close()
            mdF = open('codingbat/python/md/'+section+'/'+mdFileName, 'w')
            mdF.write(mdFile+'\n\n> [< _back to readme_](/README.md)')
            mdF.close()
            print('written '+mdFileName)

print('done')